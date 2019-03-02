package pl.mpas.advances_programming.comparing.ref_method;

import pl.mpas.advances_programming.comparing.Auto;

public class CompareByModel {

  public  int orderByModel(Auto first, Auto second) {
        return
                first.getModel().compareTo(second.getModel());
    }


}
