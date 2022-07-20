package main

import (
	"fmt"
)

func main() {
	var a int
	fmt.Print("Enter Your Age :")
	fmt.Scan(&a)
	if a > 18 {
		fmt.Print("You Are Eligible To Vote")
	} else {
		fmt.Print("You Cannot Vote")
	}
}
