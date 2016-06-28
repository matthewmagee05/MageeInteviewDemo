package com.magee.myInterviewDemo.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;

public class Hobbies extends Composite {

	private static HobbiesUiBinder uiBinder = GWT.create(HobbiesUiBinder.class);

	interface HobbiesUiBinder extends UiBinder<Widget, Hobbies> {
	}

	@UiField Anchor hobby1;
	@UiField Anchor hobby2;

	public Hobbies() {
		initWidget(uiBinder.createAndBindUi(this));
		
		hobby1.setText("3D Printing");
		hobby2.setText("Robotics");
		
		  hobby1.addClickHandler(new ClickHandler() {
	            public void onClick(ClickEvent event) {
	            	RootPanel.get().clear();
	                History.newItem("hobby1", true);
	            }
	        });
		  hobby2.addClickHandler(new ClickHandler() {
	            public void onClick(ClickEvent event) {
	            	RootPanel.get().clear();
	                History.newItem("hobby2", true); 
	            }
	        });
}
}
