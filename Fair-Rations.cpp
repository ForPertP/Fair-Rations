#include <bits/stdc++.h>

using namespace std;

string ltrim(const string &);
string rtrim(const string &);
vector<string> split(const string &);

/*
 * Complete the 'fairRations' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts INTEGER_ARRAY B as parameter.
 */

string fairRations(vector<int> B)
{
    int lastID = -1;
    int count = 0;

    for (int i = 0; i < B.size(); ++i)
    {
        if (B[i] % 2 != 0)
        {
            if (lastID == -1)
            { 
                lastID = i;
            }
            else
            {
                count += std::abs(i - lastID) * 2;
                lastID = -1;
            }
        }
    }
    
    return (lastID == -1) ? std::to_string(count) : "NO";
}
