package com.magee.myInterviewDemo.client;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FileUpload;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.FormPanel;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

public class Hobby3 extends Composite {
	private FlowPanel page1 = new FlowPanel();
    static private Hobby3 _instance = null;
 
    public Hobby3(){
    	
        initPage();
        initWidget(page1);
    }

	public static Hobby3 getInstance(){
        if(null == _instance) {
            _instance = new Hobby3();
        }
        return _instance;
    }

    private void initPage() {
    	
        Header header = new Header();
        Robotics robotics = new Robotics();
      
        
        
        page1.add(header);
        page1.add(robotics);
    }
    public static native void console(String t)
	/*-{
	    console.log(t);
	}-*/;
    
}