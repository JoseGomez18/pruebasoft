package com.co.senasoft.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {

    public static Target BNT_USERICON = Target.the("its used to enter the register section")
            .locatedBy("//img[@src='https://cdn.koaj.co/img/icons/user_disabled.png']");
    public static Target BNT_REGISTERSECTION = Target.the("its used to enter the register section")
            .locatedBy("//div[@class='dropdown_list login_custom_dropdown']//a[contains(text(),'Regístrate')]");


}
