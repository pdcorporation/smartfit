package br.com.smartfit.web.client.base;

import gwt.material.design.client.ui.MaterialContainer;
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class MainView extends Composite {

  private static MainViewUiBinder uiBinder = GWT.create(MainViewUiBinder.class);

  interface MainViewUiBinder extends UiBinder<Widget, MainView> {
  }

  @UiField
  MaterialContainer main;

  public MainView() {
    initWidget(uiBinder.createAndBindUi(this));
  }

  public void add(Widget widget) {
    main.clear();
    main.add(widget);
  }
}
