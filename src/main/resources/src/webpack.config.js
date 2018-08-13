var config = {
    entry: './index.js',
    output: {
       path:'/',
       filename: 'index.js',
    },
    devServer: {
       inline: true,
       port: 3000
    },
    module: {
       loaders: [
          {
             test: /\.jsx?$/,
             exclude: '/node_modules/',
             loader: 'babel-loader',
             query: {
                presets: ['env', 'react']
             }
          }
       ]
    }
 }
 module.exports = config;