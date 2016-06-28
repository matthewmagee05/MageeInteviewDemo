package com.magee.myInterviewDemo.client;


import java.util.Date;


import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.user.datepicker.client.DateBox;
import com.ibm.icu.text.SimpleDateFormat;

public class Robotics extends Composite {

	private static RoboticsUiBinder uiBinder = GWT.create(RoboticsUiBinder.class);

	interface RoboticsUiBinder extends UiBinder<Widget, Robotics> {
	}
	
    String s;
    Date day;
	@UiField Button reset;
	@UiField TextBox name;
	@UiField DateBox date;
	
	public Robotics() {
		initWidget(uiBinder.createAndBindUi(this));
		
		date.setFormat(new DateBox.DefaultFormat 
				(DateTimeFormat.getFormat("EEEE, MMMM dd, yyyy"))); 
		reset.setText("Reset Form");
		
		reset.addClickHandler(new ClickHandler() {
	            public void onClick(ClickEvent event) {
	            	day = date.getValue();
	            	s = name.getValue();
	            	console(s);
	            	console2(day);
	            	name.setValue("");
	            	date.setValue(null);
	            }
	        });
		
		
	      
	      
}
	public static native void console(String t)
	/*-{
	    console.log(t);
	}-*/;
	
	public static native void console2(Date t)
	/*-{
	    console.log(t);
	}-*/;
}