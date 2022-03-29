package com;

public class Two {
    // Complexity analysis:
    // using the maximum element substitution
    // 1st step : to find the max element present in the array
    // to find the max element we need to make n - 1 no. of comparisons
    // in each subarray
    // here n = 5
    // ex arr - 4 5 1 2 3
    // to find the max element 5 we need to make n - 1 comaprisons
    // 4 3 1 2 5
    // to find the max element 4 we need to make n - 2 comaprisons
    // 2 3 1 4 5
    // to find the max element 3 we need to make n - 3 comaprisons
    // 2 1 3 4 5
    // to find the max element 2 we need to make n - 4 comaprisons
    // 1 2 3 4 5
    // 0 comparisons
    // ans
    //IMPORTANT POINT : WITH EACH STEP THE RIGHT SIDE OF THE ARRAY GETS SORTED


    // TOTAL NO. OF COMPARISONS :
    // 0 + 1 + 2 + 3 + 4 +.... +    (N-1) COMPARISONS
    // SIMPLE MATHEMATICAL FORMULA -- SUM OF N NUMBERS
    // (N * (N+1))/2

    // here
    // formula used
    // ((n-1) * (n-1+1)) / 2 ;
    // ie (n(n-1))/2 ;
    // in case of time complexity the constant terms are removed and the less dominating terms are removed
    // full explanation in the time complexity lecture

    // so the time complexity is the O(N^2)

    // Worst Case -- O(N^2)
    // Best Case -- O(N^2)
    // cause in any case it is finding the max element and swapping it and putting it in the right index position
    //
    // SELECTION SORT IS NOT A STABLE SORTING ALGORITHM
    //
    // USE CASE : PERFORMS WELL ON SMALL ARRAY LISTS AND ARRAYS
    // IE N SHOULD BE SMALL IN ORDER TO PERFORM WELL





}


