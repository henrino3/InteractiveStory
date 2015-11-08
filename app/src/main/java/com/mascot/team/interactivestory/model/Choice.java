package com.mascot.team.interactivestory.model;

/**
 * Created by henry on 11/7/15.
 */
public class Choice {

    private String mText;
    private int mNextpage;

    public Choice(String text, int nextpage){
        mText = text;
        mNextpage = nextpage;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public int getNextpage() {
        return mNextpage;
    }

    public void setNextpage(int nextpage) {
        mNextpage = nextpage;
    }
}

