package logic

interface AggregationServiceInterface {
    fun aggregateAll();
    fun aggregatePassing(desiredYear: Int);
}