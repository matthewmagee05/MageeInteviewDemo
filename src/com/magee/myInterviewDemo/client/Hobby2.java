package com.magee.myInterviewDemo.client;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;

public class Hobby2 extends Composite {
	
	private FlowPanel page1 = new FlowPanel();
    static private Hobby2 _instance = null;
 
    public Hobby2(){
    	
        initPage();
        initWidget(page1);
    }

	public static Hobby2 getInstance(){
        if(null == _instance) {
            _instance = new Hobby2();
        }
        return _instance;
    }

    private void initPage() {
    	
        Header header = new Header();
        hobby1Printer hobbies = new hobby1Printer();
        page1.add(header);
        page1.add(hobbies);
     
    }
}