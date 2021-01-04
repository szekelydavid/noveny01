package com.company.plants;

public class Deltafa extends Noveny {
    int hatasAlfa= -3;
    int nincsSugarzas=-1;
    int deltaSugarzas=+4;
    int modMasnapiDelta;


    public void checkLife(){
        if (tapanyag > 10){
            elE=false;
        }
    }

    public int  modMasnapiDelta(){
        if(tapanyag<5){
            return 4;
        }
        if(tapanyag<11){
            return 1;
        }
        else {
            return 0;
        }
    }
}
