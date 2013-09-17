package com.SgtPetrov.SL.item;

import com.SgtPetrov.SL.lib.Strings;

public class FirstItem extends ItemSL {

    public FirstItem(int id) {
        super(id);
        this.setUnlocalizedName(Strings.RESOURCE_PREFIX + Strings.FIRST_ITEM_NAME);
       
    }

}
