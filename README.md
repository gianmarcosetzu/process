#include <iostream>
#include <unistd.h>

int main(void){
	
	int number;
	std::cout<<"the PID of this process is:" <<getpid()<<std::endl;
	//The following instuction will block the process waiting for input
	std::cin>>number;
	return 0;
}
