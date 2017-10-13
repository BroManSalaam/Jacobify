let start = Date.now();

const fs = require('fs');
const args = process.argv.slice(2);
const random = require('./random.js');

options = [


];

console.log(`Jacobifying... ${args.join('')}

`);

for (let i = 0; i < args.length; i++) {

    fs.readFile(args[i], 'utf8', function(err, data) {

        if (err) {
            return console.log(err);
        }
        let code = data.trim().split('\n');

        for (let s = 0; s < code.length; s++) {

            code[s] += '\n';

            if (code[s] === "") {
                continue;
            }

            // messy parenthesis-bracket spacing ){ or )   {
            if (code[s].includes(') {')) {

                if (random.range(1, 3) == 1) {
                    code[s] = code[s].replace(') {', ')' + " ".repeat(Math.floor(Math.random() * 4)) + '{');

                } else {
                    code[s] = code[s].replace(') {', '){');
                }
            }

            // messing up assignment operator: var x= 5;
            if (random.range(1, 2) == 2 && code[s].includes(' = ')) {

                if (random.range(1, 2) == 2) {
                    code[s] = code[s].replace(' = ', '= ');

                } else {
                    code[s] = code[s].replace(' = ', ' =');
                }
            }

            // random indents
            if (code[s].includes('}')) {
                
                code[s] = " ".repeat(Math.ceil(Math.random() * 8)) + code[s];
                
            } else if (random.range(1, 3) == 2) {
                code[s] = " ".repeat(Math.ceil(Math.random() * 8)) + code[s];
            }

            // random new line
            if (random.range(1, 7) == 2) {
                code[s] += '\n';
            }
        }

        // add trailing whitespace
        code[code.length - 1] += '\n\n\n\n\n\n\n\n';


        console.log(code.join(''));
        // finish
        //         console.log(`-------------------- Jacobified: ${args[i]} --------------------

        // ${code}

        // ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^



        // //         `);

        //         fs.writeFile(args[i], data, (err) => {

        //             if (err) {
        //                 return console.log(err);
        //             }

        //             console.log(`-------------------- Jacobified: ${args[i]} --------------------

        // ${data}
        // ==================== ${args[i]} ====================




        //             `);

        //         });
    });
}

process.on('exit', () => {
    console.log(`==================== Final Results ====================
Time: ${Date.now() - start} ms
====================                    ====================`);
});