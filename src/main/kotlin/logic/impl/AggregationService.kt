package logic.impl

import logic.AggregationServiceInterface
import model.yearly.PlayerPassing
import org.jsoup.Jsoup
import org.jsoup.select.Elements

class AggregationService() : AggregationServiceInterface {
    var passingData: ArrayList<PlayerPassing>? = null;

    init {
        println("Data Aggregation Beginning");
        aggregatePassing(2023);
    }

    override fun aggregateAll() {
        TODO("Not yet implemented")
    }

    override fun aggregatePassing(desiredYear: Int) {
        //Todo: create data models in kotlin then map this data to it
        val url = String.format("https://www.pro-football-reference.com/years/%S/passing.htm#passing::pass_cmp\n",desiredYear.toString())
        val doc = Jsoup.connect(url)
            .header("Content-Type", "application/x-www-form-urlencoded")
            .header("Referrer Policy", "strict-origin-when-cross-origin")
            .userAgent("Mozilla/5.0 (Macintosh; Intel Mac OS X 10.19; rv:109.0) Gecko/20100101 Firefox/115.0")
            .referrer("http://google.com")
            .timeout(5000)
            .cookie("someCookie", "someValue")
            .referrer("http://google.com")
            .get();
        //Giggity

        var header: Elements = doc.body().select("tr")
        println(header[0].text())
        val tableElement : Elements = doc.body().select("tbody")
        val rows : Elements = tableElement[0].select("tr");
        val rawDataList : ArrayList<String> = ArrayList();
        val processedDataList : ArrayList<PlayerPassing> = ArrayList();
        var rowCount :Int = 1;
        for (row in rows) {
            val temp : Elements=row.getElementsByTag("td");
//            println(temp.text()+"----")
            //Rank is order of the list
            // auto generated yearly playerID? PK
            //currentt year
            // auto generated playerID FK
            val stringList = temp.eachText();
            //rank = rowCount
            println(stringList);
            rawDataList.add(row.getElementsByTag("td").text())
            rowCount +=1;
        }
        println(rawDataList.get(0));

    }

    companion object {
        fun aggregatePassing() {
            TODO("Not yet implemented")
        }
    }
}