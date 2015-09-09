package br.com.smartfit.web.client.base;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class HeaderView extends Composite {

  private static HeaderViewUiBinder uiBinder = GWT.create(HeaderViewUiBinder.class);

  interface HeaderViewUiBinder extends UiBinder<Widget, HeaderView> {
  }

  public HeaderView() {
    initWidget(uiBinder.createAndBindUi(this));
  }
}
