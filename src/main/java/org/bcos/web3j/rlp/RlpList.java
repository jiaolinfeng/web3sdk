package org.bcos.web3j.rlp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * RLP list type.
 */
public class RlpList implements RlpType {
    private final List<RlpType> values;

    public RlpList() {
        this.values = new ArrayList<RlpType>();
    }
    
    public RlpList(RlpType... values) {
        this.values = Arrays.asList(values);
    }

    public RlpList(List<RlpType> values) {
        this.values = values;
    }

    public List<RlpType> getValues() {
        return values;
    }
    
    public void add(RlpType value) {
        values.add(value);
    }
}
