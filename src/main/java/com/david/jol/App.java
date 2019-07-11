package com.david.jol;

import org.openjdk.jol.info.ClassLayout;

public class App {
  public static void main(String[] args) {
    System.setProperty("jol.ignoreInstrumentation", "true");
    System.out.println(ClassLayout.parseClass(Object.class).toPrintable());
  }
}
