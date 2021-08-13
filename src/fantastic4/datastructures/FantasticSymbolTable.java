package fantastic4.datastructures;

import java.util.ArrayList;
import java.util.HashMap;

public class FantasticSymbolTable {

    private HashMap<String, FantasticSymbol> map;

    public FantasticSymbolTable(HashMap<String, FantasticSymbol> map) {
        this.map = map;
    }

    public void add(FantasticSymbol symbol) {
        map.put(symbol.getName(), symbol);
    }

    public boolean exists(String symbolName) {
        return map.get(symbolName) != null;
    }

    public FantasticSymbol get(String symbolName) {
        return map.get(symbolName);
    }

    public ArrayList<FantasticSymbol> getAll(){
        ArrayList<FantasticSymbol> lista = new ArrayList<FantasticSymbol>();
        for (FantasticSymbol symbol : map.values()) {
            lista.add(symbol);
        }
        return lista;
    }
}
