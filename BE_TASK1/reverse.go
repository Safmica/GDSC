package main

import "fmt"

func reverse(nilai int32) int32 {
	var temp int32
	var ret int32 = 0

	for temp = nilai; temp > 0; temp = temp / 10 {
		ret = (ret * 10) + (temp % 10)
	}

	return ret

}

func main(){
    var A, B, C int32
	fmt.Scan(&A, &B)
	C = reverse(reverse(A) + reverse(B))
	fmt.Print(C)
}