
const url = "http://localhost:8080/api";

const Services = {

    cadastrarViagem: function (viagem) {
        return new Promise((resolve, reject) => {
            fetch(url + '/viagem', { method: 'POST', body: JSON.stringify({ localEmbarque: { "codigoLocalizacao": viagem.embarque }, localDesembarque: { "codigoLocalizacao": viagem.desembarque }, dataSaida: viagem.saida, dataChegada: viagem.chegada, horaSaida: "0", horaChegada: "0", valor: viagem.valor }), headers: { 'Content-Type': 'application/json' } }).then(function (result) { return result.json(); }).then(resolve).catch(resolve)
        })
    },

    cadastrarTransporte: function (transporte) {
        return new Promise((resolve, reject) => {
            fetch(url + '/transporte', { method: 'POST', body: JSON.stringify({ numeroAssentos: transporte.assento, identificador: transporte.identificador }), headers: { 'Content-Type': 'application/json' } }).then(function (result) { return result.json(); }).then(resolve).catch(resolve)
        })
    },

    cadastrarLocal: function (localizacao) {
        return new Promise((resolve, reject) => {
            fetch(url + '/localizacao', { method: 'POST', body: JSON.stringify({ descricao: localizacao.descricao, localizacao: localizacao.localizacao, imagem: localizacao.imagem }), headers: { 'Content-Type': 'application/json' } }).then(function (result) { return result.json(); }).then(resolve).catch(resolve)
        })
    },

    buscarViagens: function () {
        return new Promise((resolve, reject) => {
            fetch(url + '/viagem', { method: 'GET', headers: { 'Content-Type': 'application/json' } }).then(function (result) { return result.json(); }).then(resolve).catch(resolve)
        })
    },

    buscarViagem: function (codigo) {
        return new Promise((resolve, reject) => {
            fetch(url + '/viagem/' + codigo, { method: 'GET', headers: { 'Content-Type': 'application/json' } }).then(function (result) { return result.json(); }).then(resolve).catch(resolve)
        })
    }
}


export default Services;