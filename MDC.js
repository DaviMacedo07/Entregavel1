function mdc(a, b) {
    while (b !== 0) {
        let temp = b;
        b = a % b;
        a = temp;
    }
    return a;
}

const a = 33, b = 66;
console.log(`O MDC de ${a} e ${b} é: ${mdc(a, b)}`);