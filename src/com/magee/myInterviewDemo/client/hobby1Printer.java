package com.magee.myInterviewDemo.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Widget;

public class hobby1Printer extends Composite {

	private static hobby1PrinterUiBinder uiBinder = GWT.create(hobby1PrinterUiBinder.class);

	interface hobby1PrinterUiBinder extends UiBinder<Widget, hobby1Printer> {
	}

	public hobby1Printer() {
		initWidget(uiBinder.createAndBindUi(this));
	}



	

}
