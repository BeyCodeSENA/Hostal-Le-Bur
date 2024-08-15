const { createApp } = Vue;

const app = createApp({
    data() {
        return {
            id: new URLSearchParams(location.search).get('id') ,
        }
    },

    methods: {
        exit() {
            axios.post('/api/logout')
                .then(response => window.location.href="/inicio.html")
                .catch(error => console.log(error));
        },
    }
}).mount('#app');


