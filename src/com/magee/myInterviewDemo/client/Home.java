package com.magee.myInterviewDemo.client;


import com.magee.myInterviewDemo.client.MyHistoryListener;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.History;

public class Home implements EntryPoint {
       
    public void onModuleLoad() {
        String initToken = History.getToken();
        
        if (initToken.length() == 0) {
          History.newItem("page1");
        }
        
        History.addValueChangeHandler(new MyHistoryListener());
        History.fireCurrentHistoryState(); 
    }
}