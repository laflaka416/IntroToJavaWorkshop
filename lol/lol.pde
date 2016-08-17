void setup(){
size(1000,800);  
}
void draw(){
if(mousePressed){
fill(random(255),random(255),random(255));  
}
else{
fill(0,0,0);  
}
ellipse(500,400,400,500);  
}
