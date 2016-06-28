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
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

public class Header extends Composite {

	private static HeaderUiBinder uiBinder = GWT.create(HeaderUiBinder.class);

	interface HeaderUiBinder extends UiBinder<Widget, Header> {
	}
	
	@UiField Anchor home;
	@UiField Anchor printing;
	@UiField Anchor robotics;

	public Header() {
		initWidget(uiBinder.createAndBindUi(this));
		
		home.setText("Home |");
		printing.setText("3D Printing  |");
		robotics.setText("Robotics");
		  home.addClickHandler(new ClickHandler() {
	            public void onClick(ClickEvent event) {
	            	RootPanel.get().clear();
	                History.newItem("page1", true);
	                //History.fireCurrentHistoryState();
	            }
	        });
		  printing.addClickHandler(new ClickHandler() {
	            public void onClick(ClickEvent event) {
	            	RootPanel.get().clear();
	                History.newItem("hobby1", true); 
	            }
	        });
		  robotics.addClickHandler(new ClickHandler() {
	            public void onClick(ClickEvent event) {
	            	RootPanel.get().clear();
	                History.newItem("hobby2", true); 
	            }
	        });
		
	}

}
