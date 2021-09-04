//Program to calculate the distance between two points 
#include<iostream>
#include <math.h>
using namespace std;

class Point{
    int a,b;

    public:
    void getValue(int x,int y){
        a=x;
        b=y;
    }
    friend float distance(Point r,Point s);
};
    

    float distance(Point r,Point s){
        float res = sqrt(((r.a - s.a)*(r.a - s.a)) + ((r.b-s.b)*(r.b-s.b)));
        return res;
    }


int main(){
    Point o1;
    Point o2;
    // int num1 = 1;
    // int num2 = 1;
    // int no1 = 3;
    // int no2 = 2;
    o1.getValue(1,0);
    o2.getValue(70,0);

    cout<<"The distance between points o1 and 02 is "<<distance(o1,o2)<<endl;
    return 0;
}




