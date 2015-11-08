package com.mascot.team.interactivestory.model;

import com.mascot.team.interactivestory.R;

/**
 * Created by henry on 11/7/15.
 */
public class Story {

    private Page[] mPages;

    public Story(){
        mPages = new Page[7];

        mPages[0] = new Page(
                R.drawable.page0,
                " Hi %1$s I is your birthday and you are given the following options to",
                new Choice("Take a trip to the US", 1),
                new Choice("Take a trip to the US", 2));


        mPages[1] = new Page(
                R.drawable.page1,
                "I is your birthday and you are given the following options to",
                new Choice("Take a trip to the US", 3),
                new Choice("Take a trip to the US", 4));


        mPages[2] = new Page(
                R.drawable.page2,
                "I is your birthday and you are given the following options to",
                new Choice("Take a trip to the US", 4),
                new Choice("Take a trip to the US", 6));


        mPages[3] = new Page(
                R.drawable.page3,
                "I is your birthday and you are given the following options to",
                new Choice("Take a trip to the US", 4),
                new Choice("Take a trip to the US", 6));


        mPages[4] = new Page(
                R.drawable.page4,
                "I is your birthday and you are given the following options to",
                new Choice("Take a trip to the US", 5),
                new Choice("Take a trip to the US", 6));


        mPages[5] = new Page(
                R.drawable.page5,
                "I is your birthday and you are given the following options to");


        mPages[6] = new Page(
                R.drawable.page6,
                "I is your birthday and you are given the following options to");


    }


    public Page getPage(int PageNumber){
        return mPages[PageNumber];
    }


}
