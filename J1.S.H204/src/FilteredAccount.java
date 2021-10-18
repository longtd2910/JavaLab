/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *s
 * @author longt
 */
public class FilteredAccount extends Account{

    public FilteredAccount(Client client, int balance) {
        super(client, balance);
    }
    
    @Override
    public boolean process(Transaction t){
        if(t.value() == 0){
            super.transList.add(t);
            return false;
        }
        else{
            return super.process(t);
        }
    }

    public double percentFiltered(){
        int total = 0;
        for(Transaction t: super.transList){
            if(t.value() == 0) {
                ++total;
            }
        }
        return Math.round((double)total /(double) super.transList.size() * 100.0 * 100.0) / 100.0;
    }
}
