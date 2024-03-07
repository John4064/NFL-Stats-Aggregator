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
            //Rank is order of the list
            //     private val yearlyRank: Int,
            //    private val yearlyPlayerID: Int,
            //    private val year: Int,
            //    private val playerID: Int,
            //currentt year
            // auto generated playerID FK
            //rank = rowCount
            //yearlyPlayerID = -1
            //desiredYear
            //playerID = -1
            //stringList[0]playerName
            //stringList[1]teamName
            //stringList[2]age
            //stringList[3]position
            //stringList[4]gamesPlayed
            //stringList[5]gamesStarted
            //stringList[6]qbRecord
            //stringList[7]completionCount
            //stringList[8]passAttempts
            //stringList[9]completionPercentage
            //stringList[10]passingYards
            //stringList[11]passingTDCount
            //stringList[12]passingTDPercentage
            //stringList[13]interceptionCount
            //stringList[14]interceptionPercentage
            //stringList[15]firstDowns
            //stringList[16]successPercentage
            //stringList[17]longestPass
            //stringList[18]yardsPerAttempt
            //stringList[19]adjustedYardsPerAttempt
            //stringList[20]yardsPerCompletion
            //stringList[21]yardsPerGame
            //stringList[22]passerRating
            //stringList[23]qbr
            //stringList[24]sackCount
            //stringList[25]yardsLostOnSack
            //stringList[26]sackPercentage
            //stringList[27]netYardsPerAttempt
            //stringList[28]adjustedNetYardPerAttempt
            //stringList[29]fourthQuarterComebacks
            //stringList[30]gameWinningDrives
            val temp : Elements=row.getElementsByTag("td");
            val stringList = temp.eachText();
            //Account for empty list
            if(stringList.isEmpty()){
                continue;
            }
            println(stringList.size);
            println(stringList);
            //Not all data is populated which is problematic
            //var tempPlayer: PlayerPassing = PlayerPassing(rowCount, -1, desiredYear, -1, stringList[0],stringList[1], stringList[2].toInt(), stringList[3], stringList[4].toInt(), stringList[5].toInt(), stringList[6], stringList[7].toInt(), stringList[8].toInt(), stringList[9].toFloat(), stringList[10].toInt(), stringList[11].toInt(), stringList[12].toFloat(), stringList[13].toInt(), stringList[14].toFloat(), stringList[15].toInt(), stringList[16].toFloat(), stringList[17].toInt(), stringList[18].toFloat(), stringList[19].toFloat(), stringList[20].toFloat(), stringList[21].toFloat(), stringList[22].toFloat(), stringList[23].toFloat(), stringList[24].toInt(), stringList[25].toInt(), stringList[26].toFloat(), stringList[27].toFloat(), stringList[28].toFloat(), stringList[29].toInt(), stringList[30].toInt())
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