#include<iostream>
using namespace std;

class Base{
    int data1;

    public:
    int data2;
    void setData();
    int getData1();
    int getData2();
};

void Base :: setData(){
    data2 = 32;

}

int Base :: getData2(void)
{
return data2;
}



class Derived : public Base{  //syntax of derived class
    int p;
    public:
    int getCode();
    int language;
}; 

int Derived :: getCode(void){  //doubt
    language=2;
    return language;
}

int main(){
    Base ob;
    cout<<ob.getData2();

}

