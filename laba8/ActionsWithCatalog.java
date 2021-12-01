package laba8;
import java.util.*;

import laba8.Countries.TypeComparator;
public class ActionsWithCatalog  {

    public static List<Countries> CreateCountriesCatalog(){
        List<Countries> countriesCatalog = new ArrayList<>();
        countriesCatalog.add(new Countries("Беларусь", "Минск", 207600, 9, "Евразия"));
        countriesCatalog.add(new Countries("Италия", "Рим", 301338, 60, "Евразия"));
        countriesCatalog.add(new Countries("Англия", "Лондон", 242495, 66, "Евразия"));
        countriesCatalog.add(new Countries("США", "Вашингтон", 9834000, 328, "Северная Америка"));
        countriesCatalog.sort(new Countries.NameComparator());
        return countriesCatalog;
    }

    public static List<Countries> sortCountriesByCapital(List<Countries> countriesCatalog){
        countriesCatalog.sort(new Countries.TypeComparator());
        return countriesCatalog;
    }

    public static void SearchCountriesByContinent(List<Countries> countriesCatalog, String continent){
        Interface.catalog.setText(null);
        for (Countries element: countriesCatalog) {
            if (element.getContinent().equals(continent)){
                Interface.catalog.append(element.toString());
            }
        }
    }
}
