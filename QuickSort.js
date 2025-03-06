function quicksort(arr) {
    if (arr.length <= 1) return arr;
    let pivot = arr[arr.length - 1];
    let left = [], right = [];
    for (let i = 0; i < arr.length - 1; i++) {
        if (arr[i] < pivot) left.push(arr[i]);
        else right.push(arr[i]);
    }
    return [...quicksort(left), pivot, ...quicksort(right)];
}

const arr = [34, 7, 23, 32, 5, 62];
console.log("Array ordenado:", quicksort(arr));