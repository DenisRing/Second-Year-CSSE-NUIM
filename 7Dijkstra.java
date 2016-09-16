while(visited<size){ //while not all vertices visited
 int minvalue=Integer.MAX_VALUE; //set to infinity as default-there must be something shorter
 int minvertex=-1; //a default which will crash if it
is not superseded
 for(int j=0;j<size;j++){ //find the next vertex to visit
 if(vertices[j].visited==false){ //if it has not been visited
 if(vertices[j].distance<minvalue){
 minvalue=vertices[j].distance;
 minvertex=j; //we are choosing the closest vertex to the starting position which has not been visited yet
 }
 }
 }
 vertices[minvertex].visited=true; //we have now visited it
 visited++;
 for(int j=0;j<size;j++){ 

if(array[j][minvertex]>0&&vertices[j].visited==false){ 

if(vertices[j].distance>vertices[minvertex].distance+array[j][minvertex]){

vertices[j].distance=vertices[minvertex].distance+array[j][minvertex];
//update if a new shorter route to this vertex has been found
 vertices[j].route=minvertex; //track the
path taken
 }
 }
 }
 }