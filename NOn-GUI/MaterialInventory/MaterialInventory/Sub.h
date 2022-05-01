#pragma once
#include "DataStructure.h"
Staff* create_Node_Staff();
void Add_1_Staff(tree& t, Staff* p);

void StringtoString(string& a)
{
	//!.......TaBlE.... pOps.../
	//|Table Pops|
	while (a[0] == ' ')
	{
		a.erase(a.begin() + 0);
	}
	while (a[a.length() - 1] == ' ')
	{
		a.erase(a.begin() + a.length() - 1);
	}
	for (int i = 0; i < a.length(); i++)
	{
		if (a[i] == ' ' && a[i + 1] == ' ')
		{
			a.erase(a.begin() + i + 1);
			i--;
		}
	}
	// Cap firstletter
	if (a[0] >= 97 && a[0] <= 122) {
		a[0] -= 32;
	}
	for (int i = 1; i < a.length(); i++)
	{
		if (a[i] == ' ')
		{
			i++;
			if (a[i] >= 97 && a[i] < 122)
			{
				a[i] -= 32;
			}
		}
	}
}

