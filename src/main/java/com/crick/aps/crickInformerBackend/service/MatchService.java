package com.crick.aps.crickInformerBackend.service;

import com.crick.aps.crickInformerBackend.entities.Match;

import java.util.List;

public interface MatchService {

    // get all matches
    List<Match> getAllMatches();

    // get live matches
    List<Match> getLiveMatches();

    // cwc table
    List<List<String>> getPointTable();

}
