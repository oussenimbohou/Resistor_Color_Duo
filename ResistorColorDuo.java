class ResistorColorDuo {
    int value(String[] colors) {
        String firstCode = null,secondCode = null;
    int[] codeArray = {0,1,2,3,4,5,6,7,8,9};
        String[] colorsArray = {"black","brown","red","orange","yellow","green","blue","violet","grey","white"};
        if(colors.length > 1){
for(int i = 0; i < codeArray.length; i++){
    if(colors[0] == colorsArray[i]) 
        firstCode = codeArray[i] + "";
    }
    for(int i = 0; i < codeArray.length; i++){
    if(colors[1] == colorsArray[i])
        secondCode = firstCode + codeArray[i];
        }
        return Integer.parseInt(secondCode);
        }
        return -1;
        }
}
