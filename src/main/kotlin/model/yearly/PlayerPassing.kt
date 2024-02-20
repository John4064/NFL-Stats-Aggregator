package model.yearly

import lombok.Data

data class PlayerPassing(
    private val yearlyRank: Int,
    private val yearlyPlayerID: Int,
    private val year: Int,
    private val playerID: Int,
    private val playerName: String,
    private val team: String,
    private val age: Int,
    private val position: String,
    private val gamesPlayed: Int,
    private val gamesStarted: Int,
    private val record: String,
    private val completionCount: Int,
    private val attemptCount: Int,
    private val completionPercentage: Float,
    private val yards: Int,
    private val tdCount: Int,
    private val tdPercentage: Float,
    private val interceptionCount: Int,
    private val interceptionPercentage: Int,
    private val firstDownCount: Int,
    private val passSuccessRate: Float,
    private val longPass: Int,
    private val yardsPerAttempt: Float,
    private val adjustedYardsPerAttempt: Float,
    private val yardsPerCompletion: Float,
    private val yardsPerGame: Float,
    private val passingRating: Float,
    private val qbr: Float,
    private val sackCount: Int,
    private val yardsLostOnSack: Int,
    private val sackPercentage: Float,
    private val netYardsPerAttempt: Float,
    private val adjustedNetYardPerAttempt: Float,
    private val fourthQuarterComebacks: Int,
    private val gameWinningDrives: Int
) {
//    constructor(qbr:Float): this(qbr){};


    override fun toString(): String {
        return "PlayerPassing(yearlyRank=$yearlyRank, yearlyPlayerID=$yearlyPlayerID, year=$year, playerID=$playerID, playerName='$playerName', team='$team', age=$age, position='$position', gamesPlayed=$gamesPlayed, gamesStarted=$gamesStarted, record='$record', completionCount=$completionCount, attemptCount=$attemptCount, completionPercentage=$completionPercentage, yards=$yards, tdCount=$tdCount, tdPercentage=$tdPercentage, interceptionCount=$interceptionCount, interceptionPercentage=$interceptionPercentage, firstDownCount=$firstDownCount, passSuccessRate=$passSuccessRate, longPass=$longPass, yardsPerAttempt=$yardsPerAttempt, adjustedYardsPerAttempt=$adjustedYardsPerAttempt, yardsPerCompletion=$yardsPerCompletion, yardsPerGame=$yardsPerGame, passingRating=$passingRating, qbr=$qbr, sackCount=$sackCount, yardsLostOnSack=$yardsLostOnSack, sackPercentage=$sackPercentage, netYardsPerAttempt=$netYardsPerAttempt, adjustedNetYardPerAttempt=$adjustedNetYardPerAttempt, fourthQuarterComebacks=$fourthQuarterComebacks, gameWinningDrives=$gameWinningDrives)"
    }

}


/**
 * CREATE TABLE yearly_passing(
 * yearlyRank int,
 * yearlyPlayerID int PRIMARY KEY AUTO_INCREMENT,
 * year int,
 * playerID int NOT NULL,
 * playerName varchar(255),
 * team varchar(100),
 * age int,
 * position varchar(100),
 * gamesPlayed int,
 * gamesStarted int,
 * record varchar(50),
 * completionsCount int,
 * attemptCount int,
 * completionPercentage float,
 * yards int,
 * tdCount int,
 * tdPercentage float,
 * interceptionCount int,
 * interceptionPercentage float,
 * firstDownCount int,
 * passSuccessRate float,
 * longPass int
 * yardsPerAttempt float,
 * adjustedYardsPerAttempt float,
 * yardsPerCompletion float,
 * yardsPerGame float,
 * passerRating float,
 * qbr float,
 * sackCount int,
 * yardsLostOnSack int,
 * sackPercentage float,
 * netYardsPerAttempt float,
 * adjustedNetYardPerAttempt float,
 * fourthQuarterComebacks int,
 * gameWinningDrives int,
 * FOREIGN KEY (playerID) REFERENCES playerLookup(playerID)
 * );
 */
