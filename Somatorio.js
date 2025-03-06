function somatorio(n) {
    let soma = 0;
    for (let i = 1; i <= n; i++) {
        soma += i;
    }
    return soma;
}

const numero = 5; 
console.log(`A soma dos números de 1 até ${numero} é: ${somatorio(numero)}`);