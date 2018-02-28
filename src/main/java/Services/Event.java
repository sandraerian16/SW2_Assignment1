package Services;

public class Event {
    String  match_id;
    String country_name;
    String league_name;
    String match_date;
    String match_hometeam_name;
    String match_awayteam_name;
    String match_hometeam_score;
    String match_awayteam_score;

    public String getMatch_id() {
        return match_id;
    }

    public void setMatch_id(String match_id) {
        this.match_id = match_id;
    }

    public String getCountry_name() {
        return country_name;
    }

    public void setCountry_name(String country_name) {
        this.country_name = country_name;
    }

    public String getLeague_name() {
        return league_name;
    }

    public void setLeague_name(String league_name) {
        this.league_name = league_name;
    }

    public String getMatch_date() {
        return match_date;
    }

    public void setMatch_date(String match_date) {
        this.match_date = match_date;
    }

    public String getMatch_hometeam_name() {
        return match_hometeam_name;
    }

    public void setMatch_hometeam_name(String match_hometeam_name) {
        this.match_hometeam_name = match_hometeam_name;
    }

    public String getMatch_awayteam_name() {
        return match_awayteam_name;
    }

    public void setMatch_awayteam_name(String match_awayteam_name) {
        this.match_awayteam_name = match_awayteam_name;
    }

    public String getMatch_hometeam_score() {
        return match_hometeam_score;
    }

    public void setMatch_hometeam_score(String match_hometeam_score) {
        this.match_hometeam_score = match_hometeam_score;
    }

    public String getMatch_awayteam_score() {
        return match_awayteam_score;
    }

    public void setMatch_awayteam_score(String match_awayteam_score) {
        this.match_awayteam_score = match_awayteam_score;
    }
}
