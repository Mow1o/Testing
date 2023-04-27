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
    int k = 5; // Max input values to array
    int output_data; // Sorting ascending order

    printf("\nEnter 5 number values to array: \n", input_data);
    for (int e = 0; e < k; e++)
    {
        printf("Add to array Index[%d] = ", e);
        scanf("%d", &input_data[e]);
    }

    int input_data_length = sizeof(input_data) / sizeof(input_data[0]); // Length of the input array
    {
        for (int i = 0; i < input_data_length; i++)
        {
            for (int j = i + 1; j < input_data_length; j++)
            {
                if (input_data[i] > input_data[j])
                {
                    output_data = input_data[i];
                    input_data[i] = input_data[j];
                    input_data[j] = output_data;
                }
            }
        }
    }

    for (int i = 0; i < input_data_length; i++)
    {
        printf("%d, ", input_data[i]);
    }

    return 0;
}
