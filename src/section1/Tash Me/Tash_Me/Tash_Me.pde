PImage mustache;
PImage face;
void setup() {
face = loadImage("images.jpeg");
size(800, 600);
face.resize(width,height);
mustache = loadImage("mustache.jpg");
mustache.resize(450,200);
}

void draw() {
background(face);
image(mustache, 150, 400);
}
