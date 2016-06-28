package com.magee.myInterviewDemo.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Document;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.magee.myInterviewDemo.client.Header.HeaderUiBinder;

public class Hobby1 extends Composite {
	
    private FlowPanel page1 = new FlowPanel();
    static private Hobby1 _instance = null;
 
    public Hobby1(){
    	
        initPage();
        initWidget(page1);
    }

	public static Hobby1 getInstance(){
        if(null == _instance) {
            _instance = new Hobby1();
        }
        return _instance;
    }

    private void initPage() {
    	
        Header header = new Header();
        Hobbies hobbies = new Hobbies();
        page1.add(header);
        page1.add(hobbies);
     
    }
}
