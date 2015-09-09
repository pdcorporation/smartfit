package br.com.smartfit.web.client.base;

import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;

public class RootMain {

  private static final RootMain MAIN = new RootMain();
  private HeaderView headerView;
  private MainView mainView;
  private FooterView footerView;

  private RootMain() {
    headerView = new HeaderView();
    mainView = new MainView();
    footerView = new FooterView();
    RootPanel.get().add(headerView);
    RootPanel.get().add(mainView);
    RootPanel.get().add(footerView);
  }

  public static RootMain get() {
    return MAIN;
  }

  public void add(Widget widget) {
    mainView.add(widget);
  }
}
