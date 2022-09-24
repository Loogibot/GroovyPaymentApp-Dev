package com.imobile3.groovypayments.data.enums;

import java.util.ArrayList;
import java.util.List;

public class GroovyProductList {
    public static int productIcon(int pos) {
        List<Integer> icons = new ArrayList<>();

        icons.add(GroovyIcon.Sandwich.drawableRes);
        icons.add(GroovyIcon.BatteryPack.drawableRes);
        icons.add(GroovyIcon.WoodenChair.drawableRes);
        icons.add(GroovyIcon.CoffeeMug.drawableRes);
        icons.add(GroovyIcon.TShirt.drawableRes);
        icons.add(GroovyIcon.RetroController.drawableRes);
        icons.add(GroovyIcon.WrappedSweet.drawableRes);
        icons.add(GroovyIcon.CeremonialMask.drawableRes);
        icons.add(GroovyIcon.Pencil.drawableRes);
        icons.add(GroovyIcon.Teapot.drawableRes);
        icons.add(GroovyIcon.PineTree.drawableRes);
        icons.add(GroovyIcon.OpenedFoodCan.drawableRes);
        icons.add(GroovyIcon.Sandwich.drawableRes);
        icons.add(GroovyIcon.HammerNails.drawableRes);
        icons.add(GroovyIcon.HammerNails.drawableRes);
        icons.add(GroovyIcon.CoffeeMug.drawableRes);

        return icons.get(pos);
    }

    public static int iconColor(int pos) {
        List<Integer> colors = new ArrayList<>();
        colors.add(GroovyColor.Yellow.colorRes);
        colors.add(GroovyColor.Gray.colorRes);
        colors.add(GroovyColor.Blue.colorRes);
        colors.add(GroovyColor.Red.colorRes);
        colors.add(GroovyColor.Orange.colorRes);
        colors.add(GroovyColor.Purple.colorRes);
        colors.add(GroovyColor.Orange.colorRes);
        colors.add(GroovyColor.Green.colorRes);
        colors.add(GroovyColor.Blue.colorRes);
        colors.add(GroovyColor.Orange.colorRes);
        colors.add(GroovyColor.Gray.colorRes);
        colors.add(GroovyColor.Yellow.colorRes);
        colors.add(GroovyColor.Purple.colorRes);
        colors.add(GroovyColor.Green.colorRes);
        colors.add(GroovyColor.Red.colorRes);
        colors.add(GroovyColor.Gray.colorRes);
        return colors.get(pos);
    }
}
