package com.magee.myInterviewDemo.client;

import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.user.client.ui.RootPanel;

public class MyHistoryListener implements ValueChangeHandler<String> {

    @Override
    public void onValueChange(ValueChangeEvent<String> event) {
        System.out.println("Current State : " + event.getValue());
        
        if (event.getValue().equals("page1")){
            RootPanel.get().clear();
            RootPanel.get().add(Hobby1.getInstance());
        }
        
        if (event.getValue().equals("hobby1")){
            RootPanel.get().clear();
            RootPanel.get().add(Hobby2.getInstance());
        }   
        if (event.getValue().equals("hobby2")){
            RootPanel.get().clear();
            RootPanel.get().add(Hobby3.getInstance());
        }  
    }

	

}