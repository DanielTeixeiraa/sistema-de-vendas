/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import Class.He4rtHouses;
import Class.He4rtShoes;
import Class.He4rtX;
import Enum.TypeStore;
import Interface.Product;
import Interface.Store;
import java.util.List;

/**
 *
 * @author User
 */
public class FactoryStore {
    public static Store createStore(TypeStore type,List<Product> listProduct){
        switch(type){
            case HE4RT_HOUSES:
                return new He4rtHouses(listProduct);
            case HE4RT_SHOES:
                return new He4rtShoes(listProduct);
            case HE4RT_X:
                return new He4rtX(listProduct);
            default: return null;
}
}
}