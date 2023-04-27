// @brief
/// @param input_data Input data array, first sample is assumed to be “correct”
/// @param output_data Filtered and fitted output
/// @param input_data_length Length of the input array
/// @param max_change_rate limit that function should use to detect "outliers" in input data
/// @return number of sample errors detected, 0 if no errors, -1 if not able to fit samples
#include <stdio.h>
#include <math.h>

int main()
{
    int input_data[5]; // Input data array
    int k = 5;         // Max input values to array
    int output_data;   // Sorting ascending order
    // int over = 0;
    int digitcount = 0;
    int index = 0;
    // int faulty;
    // int found = 0;
    int y;
    printf("\nEnter 5 number values to array: \n", input_data);
    for (int e = 0; e < k; e++)
    {
        printf("Add to array Index[%d] = ", e);
        scanf("%d", &input_data[e]);
    }
    for (int i = 0; i < k; i++)
    {
        for (int j = i + 1; j < k; j++)
        {
            if (input_data[i] > input_data[j])
            {
                output_data = input_data[i];
                input_data[i] = input_data[j]; 
                input_data[j] = output_data;
            }
        }
    }
    for (int v = 0; v < k; v++)
    {
        digitcount = (int)log10((double)input_data[v]) + 1;
        if (digitcount >= 3) {
            // over = 1;
            input_data[v] = index + input_data[4]+1;
            break;
        }

    }
    for (int i = 0; i < k; i++){

            printf("%d, ", input_data[i]);
    }
    return 0;
}


// {
    //     for (int i = 0; i < k; i++)
    //     printf("%d, ", input_data[i]);



// for(y = 0; y < k; y++){
    //     if(input_data[y] == index)
    //     {
    //         found = 1;
    //         break;
    //     }
    // }
    // if (found == 1)
    // {
    //     printf("\n%d is found at position %d\n", index, y+1);
    // }
    // if (over)
    // {
    //     printf("digitcount is %d on value: %d \n", digitcount, index);
    // }