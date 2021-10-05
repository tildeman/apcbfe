#include <stdio.h>
#include <stdlib.h>

int isEvenNumber(int number){
	return 1-number%2;
}

int main(){
	int m,n;
	printf("Please, enter a number:\n+ n: ");
	scanf("%d",&n);
	printf("+ m: ");
	scanf("%d",&m);
	printf("The even numbers between %d and %d:\n",n,m);
	for (int i=n;i<m;i++){
		if (isEvenNumber(i)) printf("%d\n",i);
	}
}