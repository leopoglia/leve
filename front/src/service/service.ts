
const url = "https://localhost:8080/api";

const Services = {

    cadastrarViagem: function (nome, cnpj) {
        return new Promise((resolve, reject) => {
            fetch(url + '/cliente', { method: 'POST', body: JSON.stringify({ nome: nome, cnpj: cnpj }), headers: { 'Content-Type': 'application/json' } }).then(function (result) { return result.json(); }).then(resolve).catch(resolve)
        })
    }
}


export default Services;