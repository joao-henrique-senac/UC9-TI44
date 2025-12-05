function random(inferior=0, superior=1, tipo='float'){
        switch(tipo){
            case 'float': return Math.random();
            case 'int': return Math.floor(Math.random()*(superior+1))
        }

}