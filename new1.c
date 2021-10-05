#include <stdio.h>
#include <stdlib.h>

int main(){
	int n;
	scanf("%d",&n);
	switch(n){
		case 1:
			printf("CF");
			break;
		case 2:
			printf("C");
			break;
		case 3:
			printf("HDJ");
			break;
		case 4:
			printf("DW");
			break;
		case 5:
			printf("RDBMS");
			break;
		case 6:
			printf("LJBE");
			break;
		default:
			printf("None");
			break;
	}
}