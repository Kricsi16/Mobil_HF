package com.example.anime_list.model

import com.google.gson.annotations.SerializedName
import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty
import java.util.*

@ApiModel(description = "")
class Films {
    /**
     * Unique identifier representing a specific film
     */
    @get:ApiModelProperty(value = "Unique identifier representing a specific film")
    @SerializedName("id")
    var id: String = ""

    /**
     * Title of the film
     */
    @get:ApiModelProperty(value = "Title of the film")
    @SerializedName("title")
    var title: String = ""

    /**
     * Original title of the film
     */
    @get:ApiModelProperty(value = "Original title of the film")
    @SerializedName("original_title")
    var originalTitle: String = ""

    /**
     * Orignal title in romanised form
     */
    @get:ApiModelProperty(value = "Orignal title in romanised form")
    @SerializedName("original_title_romanised")
    var originalTitleRomanised: String = ""

    /**
     * Description of the film
     */
    @get:ApiModelProperty(value = "Description of the film")
    @SerializedName("description")
    var description: String = ""

    /**
     * Director of the film
     */
    @get:ApiModelProperty(value = "Director of the film")
    @SerializedName("director")
    var director: String = ""

    /**
     * Producer of the film
     */
    @get:ApiModelProperty(value = "Producer of the film")
    @SerializedName("producer")
    var producer: String = ""

    /**
     * Release year of film
     */
    @get:ApiModelProperty(value = "Release year of film")
    @SerializedName("release_date")
    var releaseDate: String = ""

    /**
     * Running time of the film in minutes
     */
    @get:ApiModelProperty(value = "Running time of the film in minutes")
    @SerializedName("running_time")
    var runningTime: String = ""

    /**
     * Rotten Tomato score of film
     */
    @get:ApiModelProperty(value = "Rotten Tomato score of film")
    @SerializedName("rt_score")
    var rtScore: String = ""

    /**
     * People found in film
     */
    @get:ApiModelProperty(value = "People found in film")
    @SerializedName("people")
    var people: List<String> =
        ArrayList()

    /**
     * Species found in film
     */
    @get:ApiModelProperty(value = "Species found in film")
    @SerializedName("species")
    var species: List<String> =
        ArrayList()

    /**
     * Locations found in film
     */
    @get:ApiModelProperty(value = "Locations found in film")
    @SerializedName("locations")
    var locations: List<String> =
        ArrayList()

    /**
     * Vehicles found in film
     */
    @get:ApiModelProperty(value = "Vehicles found in film")
    @SerializedName("vehicles")
    var vehicles: List<String> =
        ArrayList()

    /**
     * URL of film
     */
    @get:ApiModelProperty(value = "URL of film")
    @SerializedName("url")
    var url: String? = null

    override fun equals(o: Any?): Boolean {
        if (this === o) {
            return true
        }
        if (o == null || javaClass != o.javaClass) {
            return false
        }
        val films = o as Films
        return id == films.id &&
                title == films.title &&
                originalTitle == films.originalTitle &&
                originalTitleRomanised == films.originalTitleRomanised &&
                description == films.description &&
                director == films.director &&
                producer == films.producer &&
                releaseDate == films.releaseDate &&
                runningTime == films.runningTime &&
                rtScore == films.rtScore &&
                people == films.people &&
                species == films.species &&
                locations == films.locations &&
                vehicles == films.vehicles &&
                url == films.url
    }

   /* override fun hashCode(): Int {
        return Objects.hash(
            id,
            title,
            originalTitle,
            originalTitleRomanised,
            description,
            director,
            producer,
            releaseDate,
            runningTime,
            rtScore,
            people,
            species,
            locations,
            vehicles,
            url
        )
    }*/

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append("class Films {\n")
        sb.append("    id: ").append(toIndentedString(id)).append("\n")
        sb.append("    title: ").append(toIndentedString(title)).append("\n")
        sb.append("    originalTitle: ").append(toIndentedString(originalTitle)).append("\n")
        sb.append("    originalTitleRomanised: ").append(toIndentedString(originalTitleRomanised))
            .append("\n")
        sb.append("    description: ").append(toIndentedString(description)).append("\n")
        sb.append("    director: ").append(toIndentedString(director)).append("\n")
        sb.append("    producer: ").append(toIndentedString(producer)).append("\n")
        sb.append("    releaseDate: ").append(toIndentedString(releaseDate)).append("\n")
        sb.append("    runningTime: ").append(toIndentedString(runningTime)).append("\n")
        sb.append("    rtScore: ").append(toIndentedString(rtScore)).append("\n")
        sb.append("    people: ").append(toIndentedString(people)).append("\n")
        sb.append("    species: ").append(toIndentedString(species)).append("\n")
        sb.append("    locations: ").append(toIndentedString(locations)).append("\n")
        sb.append("    vehicles: ").append(toIndentedString(vehicles)).append("\n")
        sb.append("    url: ").append(toIndentedString(url)).append("\n")
        sb.append("}")
        return sb.toString()
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private fun toIndentedString(o: Any?): String {
        return o?.toString()?.replace("\n", "\n    ") ?: "null"
    }
}